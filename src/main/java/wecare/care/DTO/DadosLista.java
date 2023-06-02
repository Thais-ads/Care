package wecare.care.DTO;

import wecare.care.Modal.Pessoa;

public record DadosLista(Long id, String nome, String cpf, String idade) {

    public DadosLista(Pessoa dados){

        this(dados.getId(),dados.getNome(),dados.getCpf(),dados.getIdade());
    }
}
