package com.br.ayrton.projetospring.resources.exceptions;

import com.br.ayrton.projetospring.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    /*
        A @ControllerAdvice anotação é a especialização da @Component anotação para que seja detectada
        automaticamente por meio da varredura do caminho de classe.
     */

    /*
        Seus métodos (anotados com @ExceptionHandler) são compartilhados globalmente por vários
        @Controller componentes para capturar exceções e convertê-las em respostas HTTP.
     */

    /*
    * @ExceptionHandler -> suporte ao tratamento de exceções, ou seja, é um Manipulador de Exceções global.
    */




}
