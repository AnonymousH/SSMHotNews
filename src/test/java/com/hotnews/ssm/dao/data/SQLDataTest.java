package com.hotnews.ssm.dao.data;

import com.hotnews.ssm.dao.BaseTest;
import com.hotnews.ssm.dao.NewsDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description
 */
public class SQLDataTest extends BaseTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    SQLData sqlData;


    @Test
    public void test() throws Exception {
        for (int i = 1; i < 864; i++) {
            String category =  sqlData.queryCategory(i);
            logger.info("category------------  "+category);
        }
    }
    @Test
    public void insertCategory() throws Exception {
        Set<String> strings = new HashSet<String>();

        for (int i = 1; i < 864; i++) {
            String category =  sqlData.queryCategory(i);

            if(category!=null){

                List<String> list =  Arrays.asList(category.split(","));
                if(list!=null && !list.isEmpty()){
                    for (int j = 0; j < list.size(); j++) {
                        strings.add(list.get(j));
                    }
                }

            }

        }

        Iterator it = strings.iterator();
        while (it.hasNext()) {
            String uid = UUID.randomUUID().toString();
            sqlData.insertCategory(uid, (String) it.next());
        }
    }

    @Test
    public void insertDisLikeReason() throws Exception {
        Set<String> strings = new HashSet<String>();

        for (int i = 1 ; i < 864; i++) {
            String category = sqlData.queryDisLike(i);

            category = category.replaceAll("\\[","");
            category = category.replaceAll("]","");

            if (category != null) {

                List<String> list = Arrays.asList(category.split(","));
                if (list != null && !list.isEmpty()) {
                    for (int j = 0; j < list.size(); j++) {
                        strings.add(list.get(j).trim());
                    }
                }

            }

        }

        Iterator it = strings.iterator();
        while (it.hasNext()) {
            String uid = UUID.randomUUID().toString();
            sqlData.insertDisLikeReason(uid, (String) it.next());
        }
    }

    @Test
    public void selectDislikeID() throws Exception {
        long dislikeID = sqlData.selectDislikeID("山东鲁能");
        logger.info("dislikeID------------  "+dislikeID);
    }

    @Test
    public void insertDisLikeRelation() throws Exception {
//        Set<String> strings = new HashSet<String>();

        for (int i = 1 ; i < 864; i++) {
            String category = sqlData.queryDisLike(i);

            category = category.replaceAll("\\[","");
            category = category.replaceAll("]","");

            if (category != null) {

                List<String> list = Arrays.asList(category.split(","));
                if (list != null && !list.isEmpty()) {
                    for (int j = 0; j < list.size(); j++) {
//                        strings.add(list.get(j).trim());
                        long dislikeID = sqlData.selectDislikeID(list.get(j).trim());
                        sqlData.insertDisLikeRelation(i,dislikeID);

                    }
                }

            }

        }

//        Iterator it = strings.iterator();
//        while (it.hasNext()) {
//            String uid = UUID.randomUUID().toString();
//            sqlData.insertDisLikeReason(uid, (String) it.next());
//        }
    }

}