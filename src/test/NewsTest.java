import com.hotnews.ssm.dao.NewsDao;
import com.hotnews.ssm.dao.data.SQLData;
import com.hotnews.ssm.entity.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class NewsTest extends BaseTest{

    @Autowired
    NewsDao newsDao ;
    @Autowired
    SQLData sqlData ;

    @Test
    public void tset(){
       List<News> news = newsDao.queryNews("军事",0,0);
        System.out.printf("news==  "+news.toString());
    }

    @Test
    public void getCategory(){

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
