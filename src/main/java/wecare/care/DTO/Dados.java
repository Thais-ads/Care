package wecare.care.DTO;


import jakarta.validation.constraints.NotNull;

//Mapeando os dados que veem outside
public record Dados(

        @NotNull
        String nome,

        @NotNull
        String cpf,

        @NotNull
        String idade


) {
}
