package aplicacao;

import java.util.Scanner;
import entidade.Pessoa;

public class Cadastro extends Pessoa {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("-------------Insira os Dados-----------");
		System.out.println("Nome: ");
		pessoa.setNome(kb.nextLine());
		System.out.println("E-mail: ");
		pessoa.setEmail(kb.nextLine());
		System.out.println("CPF: ");
		pessoa.setCpf(kb.nextLine());
		System.out.println("CNPJ: ");
		pessoa.setCnpj(kb.nextLine());
		System.out.println("Telefone: ");
		pessoa.setTel(kb.nextLine());
		System.out.println("CEP: ");
		pessoa.setCep(kb.nextLine());
		System.out.println("Logradouro: ");
		pessoa.setLog(kb.nextLine());
		System.out.println("Número: ");
		pessoa.setNum(kb.nextLine());
		System.out.println("Bairro: ");
		pessoa.setBairro(kb.nextLine());
		System.out.println("Cidade: ");
		pessoa.setCidade(kb.nextLine());
		System.out.println("Estado: ");
		pessoa.setEstado(kb.nextLine());
		System.out.println("-------------Ficha de Cadastro---------------");
		System.out.printf("Nome: " + pessoa.getNome() + "\n" + "E-mail: "+pessoa.getEmail() + "\n" +"CPF: "+ pessoa.getCpf() + "\n"
				+ "CNPJ: "+pessoa.getCnpj() + "\n" +"Telefone: "+pessoa.getTel() + "\n" + "CEP: "+pessoa.getCep() + "\n" + "Logradouro"+pessoa.getLog() + "\n"
				+ "Número: "+pessoa.getNum() + "\n" + "Bairro: "+pessoa.getBairro() + "\n" + "Cidade: "+pessoa.getCidade() + "\n" + "Estado: "+pessoa.getEstado());
	}
}