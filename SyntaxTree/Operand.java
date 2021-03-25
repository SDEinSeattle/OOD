package SyntaxTree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operand {
    private Boolean booleanRes;
    private Integer integerRes;

    public Operand(boolean res) {
        this.booleanRes = res;
        this.integerRes = null;
    }

    public Operand(int res) {
        this.integerRes = res;
        this.booleanRes = null;
    }

    public boolean isInteger() {
        return this.integerRes != null;
    }

    public boolean isBoolean() {
        return this.booleanRes != null;
    }

    @Override
    public String toString() {
        return this.isInteger() ? this.integerRes.toString() : this.booleanRes.toString();
    }
}
