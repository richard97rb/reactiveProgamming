package com.curso.b;

import reactor.core.publisher.Flux;

public class PrincipalFlux {

	public static void main(String[] args) {

		// construir un Flux que es un Observable
		// para lista de elementos
		Flux<String> elementos = Flux.just("Hello","World","Hello","Chiclayo");
		elementos.subscribe(System.out::println);
		elementos.subscribe(elem->{
			System.out.print(elem.repeat(2));
		});
	}

}
