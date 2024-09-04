package com.example.genschool.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "estudantes")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @Min(value = 0, message = "Idade deve ser maior ou igual a 0")
    private Integer idade;

    @NotNull(message = "Nota do primeiro semestre não pode ser nula")
    @Column(name = "nota_primeiro_semestre")
    private Double notaPrimeiroSemestre;

    @NotNull(message = "Nota do segundo semestre não pode ser nula")
    @Column(name = "nota_segundo_semestre")
    private Double notaSegundoSemestre;

    @NotBlank(message = "Nome do professor não pode estar em branco")
    @Column(name = "nome_professor")
    private String nomeProfessor;

    @NotNull(message = "Número da sala não pode ser nulo")
    @Column(name = "numero_sala")
    private Integer numeroSala;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(Double notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public Double getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(Double notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }
}
