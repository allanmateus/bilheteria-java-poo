class Ingresso {
	String nomeFilme;
	String dataFilme;
	String horario;
	int sala;
	double valor;
	Cliente cliente;

	void calculaDescontoIdade(int anoAtual) {
		int idade = anoAtual - this.cliente.anoNasc;

		if (idade > 12 && idade < 15) {
			this.valor = this.valor - (this.valor * 0.40);
		} else if (idade >= 16 && idade <= 20) {
			this.valor = this.valor - (this.valor * 0.30);
		} else if (idade >= 20) {
			this.valor = this.valor - (this.valor * 0.20);
		}

	}

	void imprimeIngresso() {
		System.out.println(this.nomeFilme);
		System.out.println(this.dataFilme);
		System.out.println(this.horario);
		System.out.println(this.sala);
		System.out.println(this.valor);
		System.out.println(this.cliente.nome);
		System.out.println(this.cliente.anoNasc);
		System.out.println(this.cliente.cpf);
		System.out.println(this.cliente.telefone);
	}
}