package cn.tuan.service;

import cn.tuan.model.entiry.Comment;
import com.github.pagehelper.PageInfo;
/**
 * @Classname ICommentService
 * @Description 文章评论业务处理接口
 */
public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);

}

