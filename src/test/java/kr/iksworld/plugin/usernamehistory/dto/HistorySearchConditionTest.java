package kr.iksworld.plugin.usernamehistory.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistorySearchConditionTest {

    @Test
    public void elementNumberTypeTest() {
        for (HistorySearchCondition.ElementNumberType e : HistorySearchCondition.ElementNumberType.values()) {
            HistorySearchCondition<String, String> condition = new HistorySearchCondition<>();
            condition.setElementNumberType(e);
            assertEquals(e, condition.getElementNumberType());
        }
    }

    @Test
    public void sortTypeTest() {
        for (HistorySearchCondition.SortType e : HistorySearchCondition.SortType.values()) {
            HistorySearchCondition<String, String> condition = new HistorySearchCondition<>();
            condition.setSortType(e);
            assertEquals(e, condition.getSortType());
        }
    }
}
