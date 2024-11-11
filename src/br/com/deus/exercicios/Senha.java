/*
Crie um programa que lê uma senha do usuário.
Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
(por exemplo, ter pelo menos 8 caracteres).
*/

package br.com.deus.exercicios;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) throws SenhaInvalidaException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");

        try {
            String senha = sc.nextLine();
            validarSenha(senha);
            System.out.println("Senha válida.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
