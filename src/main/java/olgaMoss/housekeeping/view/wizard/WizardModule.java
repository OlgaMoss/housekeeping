package olgaMoss.housekeeping.view.wizard;

import com.google.inject.AbstractModule;
import olgaMoss.housekeeping.model.Operation;

public class WizardModule extends AbstractModule {
    @Override
    protected void configure() {
        Operation model = new Operation();
        bind(Operation.class).toInstance(model);
    }
}
