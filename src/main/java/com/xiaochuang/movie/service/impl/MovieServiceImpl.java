package com.xiaochuang.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaochuang.movie.dao.MovieMapper;
import com.xiaochuang.movie.domain.Movie;
import com.xiaochuang.movie.domain.MovieAll;
import com.xiaochuang.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public PageInfo<Movie> selAll(MovieAll movieAll,int pageNum) {
		PageHelper.startPage(pageNum,3);
		
		List<Movie> selAll = movieMapper.selAll(movieAll);
		
		PageInfo<Movie> pageInfo=new PageInfo<>(selAll);
		return pageInfo;
	}

}
