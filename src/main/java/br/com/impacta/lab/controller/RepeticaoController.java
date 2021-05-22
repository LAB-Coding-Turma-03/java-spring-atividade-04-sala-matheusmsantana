
package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class RepeticaoController {

	@GetMapping("/repeticao")
	public ResponseEntity<String> simularValores(@RequestParam(name="numero") int numero) {
		/*
		 * Elabore um algoritmo para contar até o numero que foi recebido 
		 * na variavel numero.
		 * 
		 * Exemplo de retorno:
		 * 
		 * Entrada:
		 * numero = 10
		 * 
		 * Saida:
		 * 12345678910
		 * 
		 *  
		 */
		//String retorno = "";
		/*for (int contador = 0;contador <= numero; contador++){
			String retorno = retorno + String.valueOf(contador); 
		}*/

		int cont = 1;  
		String retorno = "";
		while (cont <= numero) {
			retorno = retorno + String.valueOf(cont); 
			cont++;
		}
		return ResponseEntity.ok(retorno);
		
		//return ResponseEntity.ok(<APÓS O ALGORITMO COLOCAR A VARIAVEL String DE RETORNO AQUI>);
	}
	
}
