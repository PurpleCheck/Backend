package purpleCheck.zeroError.newForm;

import lombok.Getter;

@Getter
public class UpdateStatusResForm {
    private boolean finish;

    public UpdateStatusResForm(boolean finish) {
        this.finish = finish;
    }
}
