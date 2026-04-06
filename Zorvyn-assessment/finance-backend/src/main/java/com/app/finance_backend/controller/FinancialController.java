package com.app.finance_backend.controller;

import java.util.ArrayList;
import java.util.List;
import com.app.finance_backend.model.FinancialRecords;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialController {
	private List<FinancialRecords> records = new ArrayList<>();
	public FinancialController() {
		
	    records.add(new FinancialRecords(1, 5000, "INCOME", "Salary", "2026-04-01", "Monthly salary"));
	    records.add(new FinancialRecords(2, 2000, "EXPENSE", "Food", "2026-04-02", "Groceries"));
	}
	
			@GetMapping("/records")
			public List<FinancialRecords> getRecords(){
			return records;
	}
			@PostMapping("/records")
			public String addRecord(@RequestBody FinancialRecords record ) {
				records.add(record);
				return "Record added successfully";
			}
			@DeleteMapping("/records/{id}")
			public String deleteRecord(@PathVariable int id) {
				for(FinancialRecords record : records) {
					if(record.getId() == id) {
						records.remove(record);
						return "Record deleted";
					}
				}
				return "Record not found"; 
			}

			@GetMapping("/summary")
			public String getSummary() {
				double income = 0;
				double expense = 0;
				for(FinancialRecords record : records) {
					if(record.getType().equals("INCOME")) {
						income += record.getAmount();
					}
					if(record.getType().equals("EXPENSE")) {
						expense += record.getAmount();
					}
					
				}
				double balance = income - expense;
				return "Income: " + income +
						" Expense: " + expense +
						" Balance: " + balance;
						
			}
}
