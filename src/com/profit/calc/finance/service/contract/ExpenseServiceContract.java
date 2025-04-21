package com.profit.calc.finance.service.contract;

import com.profit.calc.finance.model.ExpenseData;
import com.profit.calc.finance.model.ProfitData;

public interface ExpenseServiceContract {
    //Double calculate(ExpenseData data, Integer units);
	Double calculate(ProfitData data);
}