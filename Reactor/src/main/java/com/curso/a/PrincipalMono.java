package com.curso.a;

import java.util.Optional;

import com.curso.entidad.Mensaje;

import reactor.core.publisher.Mono;

public class PrincipalMono {

	public static void main(String[] args) {

		// nuestro primer ejemplo con reactor
		// tenemos un elemento de tipo Mono
		// que es un tipo de Observable
		Mono<String> mimono = Mono.just("Richard");
		mimono.subscribe(System.out::println);
		
		Mono<Mensaje> mimonomensaje = Mono.justOrEmpty(new Mensaje());
		mimonomensaje.subscribe(elem -> {
			System.out.println(elem);
		});
		
		Mono<Mensaje> mimononull = Mono.justOrEmpty(null);
		mimononull.subscribe(elem -> {
			System.out.println(elem);
		});
		
		Optional<Mensaje> optMensaje;
		Mono<Optional<Mensaje>> monooptmensaje;
		
	}

}
