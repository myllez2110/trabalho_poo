package EscolaSenai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Funcionario extends Pessoa {
    // o que é do funcionario? precisaria saber quem são os funcionários da escola
    // •--==> ATRITUBTOS
    public static List<Professor> listaDeFuncionariosDaEscola = new ArrayList<Professor>();

    private LocalDate funcDataContratacao;
    private EnumStatusMatricula funcStatus;// Ativo, Afastado/Inativo, Férias

    // •--==> CONSTRUTOR

    // •--==> METODOS
    public abstract void imprimePessoa();

    // Método imprimir funcionários pelo MENU
    public static void imprimeListaDeFuncionarios() {
        if (!Funcionario.listaDeFuncionariosDaEscola.isEmpty()) {
            System.out.println("Lista de funcionários:");
            for (int i = 0; i < Funcionario.listaDeFuncionariosDaEscola.size(); i++) {
                System.out.println(
                        (i + 1) + " - " + Funcionario.listaDeFuncionariosDaEscola.get(i).getNome() + " | Status: "
                                + Funcionario.listaDeFuncionariosDaEscola.get(i).getFuncStatus().getEnumStatMat()+" | Email: "+
                                Funcionario.listaDeFuncionariosDaEscola.get(i).getEmail()+" | Senha: "+Funcionario.listaDeFuncionariosDaEscola.get(i).getSenha());
            }
        } else {
            System.out.println("Não há funcionários cadastrados.\n\n");
        }
    }

    // •--==> GETTERs SETTERs
    public EnumStatusMatricula getFuncStatus() {
        return funcStatus;
    }

    public void setFuncStatus(EnumStatusMatricula funcStatus) {
        this.funcStatus = funcStatus;
    }

}
