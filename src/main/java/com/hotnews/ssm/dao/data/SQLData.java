package com.hotnews.ssm.dao.data;


import org.apache.ibatis.annotations.Param;

/**
 * Created by AnonymousH on 2017/9/23
 *
 * @Description 分割抓取数据 从一张表转存到多张表中
 */
public interface SQLData {

    /**
     *  查询类别并插入到新表中
     * @param position
     * @return
     */
    String queryCategory(int position);

    void insertCategory(String uid, String category);

    /**
     *  查询不喜欢原因并插入到新表中
     * @param position
     * @return
     */
    String queryDisLike(int position);

    void insertDisLikeReason(String uid, String category);


    /**
     *  创建news表和dislike 表的关系表
     * @param newsID
     * @param dislikeID
     */
    void insertDisLikeRelation(@Param("newsID") long newsID ,@Param("dislikeID") long dislikeID);

    long selectDislikeID(String dislike);

    /**
     *   创建news表和categoty表的关系表
     * @param newsID
     * @param categoryID
     */
    void insertCategoryRelation(@Param("newsID") long newsID ,@Param("categoryID") long categoryID);

    long selectCategoryID(String categoryName);
}
