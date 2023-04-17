class Testa{
	public static void main(String [] args){
		Cliente cli01 = new Cliente();
		
		cli01.nome = "Zinedine Pirlo";
		cli01.anoNasc = 2009;
		cli01.cpf = "198.99.102-10";
		cli01.telefone = "(35) 9 88102398";
		
		Cliente cli02 = new Cliente();
		
		cli02.nome = "Andrés Del Piero";
		cli02.anoNasc = 1998;
		cli02.cpf = "308.291.114-07";
		cli02.telefone = "(35) 9 99147467";
		
		Ingresso ing01 = new Ingresso();
		
		ing01.nomeFilme = "O Show de Truman";
		ing01.dataFilme = "15/03/2023";
		ing01.horario = "20h00";
		ing01.sala = 4;
		ing01.valor = 25.0;
		ing01.cliente = cli01;

		Ingresso ing02 = new Ingresso();
		
		ing02.nomeFilme = "Forrest Gump - 0 Contador de histórias";
		ing02.dataFilme = "11/03/2023";
		ing02.horario = "19h00";
		ing02.sala = 2;
		ing02.valor = 17.5;
		ing02.cliente = cli02;

		ing01.nomeFilme = "Django Livre";
		ing02.nomeFilme = "Ilha do Medo";
	
		ing01.cliente.telefone = "(21) 9 98239812";
		ing02.cliente.telefone = "(11) 9 99145378";

		ing01.calculaDescontoIdade(2023);
		ing02.calculaDescontoIdade(2023);
		
		ing01.imprimeIngresso();
		ing02.imprimeIngresso();
		
		
	}
}