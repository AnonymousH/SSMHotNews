package com.hotnews.ssm.dao.data;

import com.hotnews.ssm.dao.BaseTest;
import com.hotnews.ssm.dao.NewsDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description
 */
public class SQLDataTest extends BaseTest{


    @Autowired
    NewsDao newsDao ;
    @Autowired
    SQLData sqlData ;

    @Test
    public void insertCategory() throws Exception {
        Set<String> strings = new HashSet<String>();

        for (int i = 0; i < 863; i++) {
            String category =  newsDao.queryType(i);

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
//            System.out.printf("category-------  "+it.next());
            String uid = UUID.randomUUID().toString();
            sqlData.insertCategory(uid, (String) it.next());
        }
    }

}