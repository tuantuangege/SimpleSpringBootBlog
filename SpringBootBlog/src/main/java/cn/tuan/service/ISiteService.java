package cn.tuan.service;

import cn.tuan.model.ResponseData.StaticticsBo;
import cn.tuan.model.entiry.Article;
import cn.tuan.model.entiry.Comment;

import java.util.List;
/**
 * @Classname ISiteService
 * @Description 博客站点统计服务
 */
public interface ISiteService {
    // 最新收到的评论
    public List<Comment> recentComments(int count);

    // 最新发表的文章
    public List<Article> recentArticles(int count);

    // 获取后台统计数据
    public StaticticsBo getStatistics();

    // 更新某个文章的统计数据
    public void updateStatistics(Article article);
}

