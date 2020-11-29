package br.com.todolist.model;

public enum StatusTarefa {

	PENDENTE("Pendente"),
	FAZENDO("Fazendo"), 
	COMCLUIDO("Concluido"), 
	CANCELADO("Cancelado");

	private String status;

	StatusTarefa(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
