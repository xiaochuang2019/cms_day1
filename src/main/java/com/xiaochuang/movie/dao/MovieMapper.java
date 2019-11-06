package com.xiaochuang.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xiaochuang.movie.domain.Movie;
import com.xiaochuang.movie.domain.MovieAll;
@Repository
public interface MovieMapper {

	List<Movie> selAll(MovieAll movieAll);
	
}
