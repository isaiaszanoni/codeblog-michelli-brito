package com.spring.codeblog.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.CodeblogService;

// Sinaliza para o spring que esta classe é um bean gerenciado por ele
@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	
	@Autowired // Injecao de dependencias
	CodeBlogRepository codeblogRepository; 

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	// Como o metodo retorna um optional, utilizamos
	// o .get() para retornar apenas o valor, ou uma excessão
	// caso o mesmo seja vazio.
	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get();
	}

	// metodo pronto, facinho
	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

	

	

}
