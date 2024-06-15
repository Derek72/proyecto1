package com.mycompany.logina;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author darg
 */
public class LoginA {

    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Curso> cursos = new ArrayList<>();

    public static boolean validarContrasena(String contraseña) {
        String requicitos = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[-_*=^&$#@])(?=\\S+$).{4,}$";
        Pattern pattern = Pattern.compile(requicitos);
        Matcher matcher = pattern.matcher(contraseña);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
    }
}
