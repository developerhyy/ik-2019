package org.wltea.analyzer.dic;

/**
 * @ Author     ：hyy.
 * @ Date       ：Created in 16:10 2019-1-8
 * @ Description：${description}
 * @ Modified By：hyy.
 * @Version: $version$
 */
public class Term {
    String termText = "";
    String props = "";

    public String getTermText() {
        return termText;
    }

    public void setTermText(String termText) {
        this.termText = termText;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Term [termText=" + termText + ", props=" + props + "]";
    }
}
