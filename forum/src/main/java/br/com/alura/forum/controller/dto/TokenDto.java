package br.com.alura.forum.controller.dto;

public class TokenDto {

    private String token;
    private String tipo;

    public TokenDto(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }

    private String getToken(){
        return token;
    }

    private void setToken(String token){
        this.token = token;
    }

    private String getTipo(){
        return tipo;
    }

    private void setTipo(String tipo){
        this.tipo = tipo;
    }


}
