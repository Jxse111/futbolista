/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Futbolista;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author maniana
 */
public class Futbolista {

//Atributos de clase públicos y Constantes.
    public static final LocalDate MIN_FECHA
            = LocalDate.of(2000, Month.JANUARY, 1);
    public static final LocalDate MAX_FECHA
            = LocalDate.of(2009, Month.DECEMBER, 31);
    public static final LocalDate DEFAULT_FECHA = LocalDate.of(2000, Month.JANUARY, 1);
    public static final DateTimeFormatter FORMATO_FECHA
            = DateTimeFormatter.ofPattern("dd/MM/YYYY");
//Atributos de clase
    private static int identificador = 0;
//Atributos de objeto inmutables
    private final String nombre;
    private final String apodo;
    private final int id;
    private final LocalDate fec_nac;
//Atributos de objeto mutables
    private int dorsal;

//Constructor/es
    /**
     * Constructor que devuelve un futbolista con su nombre,apodo,dorsal y su
     * fecha de nacimiento.
     *
     * @param nombre parámetro que devuelve el nombre del futbolista.
     * @param apodo parámetro que devuelve el apodo del futbolista.
     * @param dorsal parámetro que devuelve el dorsal del futbolista.
     * @param fec_nac parámetro que devuelve la fecha de nacimiento.
     */
    public Futbolista(String nombre, String apodo, int dorsal, LocalDate fec_nac) throws IllegalArgumentException {
        if (fec_nac.isBefore(MIN_FECHA) && fec_nac.isAfter(MAX_FECHA)) {
            throw new IllegalArgumentException(String.format("ERROR: La fecha es invalida %s\n", fec_nac.format(FORMATO_FECHA)));
        }
        this.nombre = nombre;
        this.apodo = apodo;
        this.dorsal = dorsal;
        this.fec_nac = fec_nac;
        this.id = ++identificador;
    }

    /**
     * Constructor de 3 parametros nacido de la fecha por defecto
     *
     * @param nombre devuelve el nombre en una cadena de caracteres
     * @param apodo devuelve el apodo del jugador en una cadena de caracteres
     * @param dorsal devuelve el dorsal del jugador almacenado en un numero
     * entero
     */
    public Futbolista(String nombre, String apodo, int dorsal) {
        this(nombre, apodo, dorsal, Futbolista.DEFAULT_FECHA);
    }

    /**
     * Constructor sin parámetros
     */
    public Futbolista() {
    }

//Métodos getter y otros métodos
    /**
     * Método get que devuelve el nombre del jugador.
     *
     * @return devuelve el nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método get que devuelve el apodo del jugador.
     *
     * @return devuelve el apodo.
     */
    public String getApodo() {
        return this.apodo;
    }

    /**
     * Método get que devuelve el dorsal del jugador.
     *
     * @return devuelve el dorsal.
     */
    public int getDorsal() {
        return this.dorsal;
    }

    /**
     * Método get que devuelve la fecha de nacimiento del jugador.
     *
     * @return devuelve la fecha de nacimiento.
     */
    public LocalDate getFec_nac() {
        return this.fec_nac;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s , apodo: %s, dorsal: %d , id: %d , fecha_Nacimiento: %s",
                this.nombre, this.apodo, this.id,
                this.fec_nac);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual = false;

        if (obj != null) {
            igual = true;
            if (this == obj) {
                igual = true;
            } else {
                if (getClass() == obj.getClass()) {
                    final Futbolista other = (Futbolista) obj;
                    if (this.dorsal == other.dorsal
                            && this.nombre.equalsIgnoreCase(other.nombre)
                            && this.apodo.equalsIgnoreCase(other.apodo)) {
                        igual = true;
                    }
                }
            }
        }
        return igual;
    }
}
