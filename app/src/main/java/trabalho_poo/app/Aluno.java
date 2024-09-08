package trabalho_poo.app;

public class Aluno {

        private String cpf;
        private String endereco;
        private String nome;
        private String d_nascimento;
        private double nota;

            public Aluno(String cpf, String endereco, String nome, String d_nascimento, double nota) {
                this.cpf = cpf;
                this.endereco = endereco;
                this.nome = nome;
                this.d_nascimento = d_nascimento;
                this.nota = nota;
          }
          public String getCpf() {
            return cpf;
        }


        public void setCpf(String cpf) {
            this.cpf = cpf;
        }


        public String getEndereco() {
            return endereco;
        }


        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getD_nascimento() {
            return d_nascimento;
        }


        public void setD_nascimento(String d_nascimento) {
            this.d_nascimento = d_nascimento;
        }


        public double getNota() {
            return nota;
        }


        public void setNota(double nota) {
            this.nota = nota;
        }
}
