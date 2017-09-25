package br.edu.univas.si8.ta.calculator.rest.impl;

import br.edu.univas.si8.ta.calculator.rest.api.CalculatorService;
import br.edu.univas.si8.ta.calculator.rest.api.Result;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public Result sum(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

	@Override
	public Result subtract(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}
	
}
