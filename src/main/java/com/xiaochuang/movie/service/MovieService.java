package com.xiaochuang.movie.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiaochuang.movie.domain.Movie;
import com.xiaochuang.movie.domain.MovieAll;

public interface MovieService {

	PageInfo<Movie> selAll(MovieAll movieAll, int pageNum);

}
