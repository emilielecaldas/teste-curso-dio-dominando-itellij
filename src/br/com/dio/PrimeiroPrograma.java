package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Plano Perfeiro", 250);
        System.out.println(livro1);

        }
    }
        class Livro{
    private String nome;
    private Integer npagina;

            public Livro(String nome, Integer npagina) {
                this.nome = nome;
                this.npagina = npagina;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public Integer getNpagina() {
                return npagina;
            }

            public void setNpagina(Integer npagina) {
                this.npagina = npagina;
            }

            @Override
            public String toString() {
                return "Livro{" +
                        "nome='" + nome + '\'' +
                        ", npagina=" + npagina +
                        '}';
            }
        }