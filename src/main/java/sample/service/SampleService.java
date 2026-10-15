package sample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
	List<String> list = new ArrayList<String>();
	public String add(String data) {
		list.add(data);
		return "added";
	}
	public List<String> findAll(){
		return list;
	}
	public String findString(String str) {
		Optional<String> data = list.stream().filter(s->s.equals(str))
					.findAny();
		if(data.isEmpty())
			return "notfound";
		else
			return data.get();
		
	}
}
