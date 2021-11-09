package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyData {
	
	@Autowired
	CodeBlogRepository codeblogRepository;
	
	// @PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Michelli Brito");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Aqui temos um belo texto da Michelli Brito sobre Docker, esta tecnologia super utilizada e que eu conheci por meio da LINUXtips");
		
		Post post2 = new Post();
		post2.setAutor("Isaias Rodrigues");
		post2.setData(LocalDate.now());
		post2.setTitulo("Aprender Exige Constância");
		post2.setTexto("Gosto de aprender, sou apaixonado por isso e me sinto bem tendo que aprender coisas novas, caminhando em rumo a uma evolução. E mais do que aprender, é importante reter informações e transformá-las em conhecimento. Com o intuito de caucificar este conhecimento, estou revendo spring boot, buscando uma abordagem um pouco diferente da que aprendi, e de maneira mais lenta. Estou muito feliz!");
	
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
