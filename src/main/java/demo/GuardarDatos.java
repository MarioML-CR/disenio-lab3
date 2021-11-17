package demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class GuardarDatos implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String nombre = (String) delegateExecution.getVariable("nombre");
        String apellido1 = (String) delegateExecution.getVariable("apellido1");
        String apellido2 = (String) delegateExecution.getVariable("apellido2");

        System.out.println("Nombre: " + nombre + " " + apellido1 + " " + apellido2);
    }
}
