package com.komponente.project;

import java.util.List;
import java.util.Optional;

import com.komponente.project.DataRepository;
import com.komponente.project.DataRepositoryJson;

public class Main {

	public static void main(String[] args) {
		DataRepository dataRepository = new DataRepositoryJson();
		dataRepository.save("test_obejct", new TestObject("1", "2"));
		dataRepository.findAll("test_obejct", TestObject.class).forEach(System.out::println);
		Optional.ofNullable(
				dataRepository.findById("test_obejct", "e3712636-df13-4678-aaff-2776f46b40ae", TestObject.class))
				.ifPresent(System.out::println);

	}
}
