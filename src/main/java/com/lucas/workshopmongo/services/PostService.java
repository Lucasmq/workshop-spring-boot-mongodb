package com.lucas.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.workshopmongo.domain.Post;
import com.lucas.workshopmongo.repository.PostRepository;
import com.lucas.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired // injeção de dependencia automatica do spring
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); // caso o obj seja null , retorna a msg
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
}
