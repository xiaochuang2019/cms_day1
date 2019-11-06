package com.xiaochuang.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.xiaochuang.movie.domain.Movie;
import com.xiaochuang.movie.domain.MovieAll;
import com.xiaochuang.movie.service.MovieService;
import com.xiaochuang.movie.util.PageUtil;
/**
 * @ClassName: MovieController 
 * @Description: TODO
 * @author: xiaoChuang
 * @date: 2019年11月2日 上午9:07:48
 */
@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	/**
	 * @Title: selAll 
	 * @Description: TODO
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String selAll(MovieAll movieAll,HttpServletRequest request,@RequestParam(defaultValue = "1") int page) {
		System.out.println(movieAll);
		PageInfo<Movie> list=movieService.selAll(movieAll,page);
		PageUtil.page(request, "/list", 3, list.getList(), (int)list.getTotal(), page);
		request.setAttribute("pg", list);
		request.setAttribute("movieAll", movieAll);
		return "list";
	}
	
}
