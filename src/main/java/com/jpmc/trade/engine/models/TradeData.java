package com.jpmc.trade.engine.models;

import java.math.BigDecimal;
import java.util.Random;

public class TradeData {
	
	private String entityName;
	private String instruction;
	private BigDecimal agreedFx;
	private String currency;
	private String instructionDate;
	private String requestedSettlementDate;
	private String actualSettlementDate;
	private int units;
	private BigDecimal pricePerUnit;
	private BigDecimal amount;
	
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public BigDecimal getAgreedFx() {
		return agreedFx;
	}
	public void setAgreedFx(BigDecimal agreedFx) {
		this.agreedFx = agreedFx;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getInstructionDate() {
		return instructionDate;
	}
	public void setInstructionDate(String instructionDate) {
		this.instructionDate = instructionDate;
	}
	public String getRequestedSettlementDate() {
		return requestedSettlementDate;
	}
	public void setRequestedSettlementDate(String requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}
	public String getActualSettlementDate() {
		return actualSettlementDate;
	}
	public void setActualSettlementDate(String actualSettlementDate) {
		this.actualSettlementDate = actualSettlementDate;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "{ entityName: "+this.getEntityName()+", instruction: "+this.getInstruction()+", agreedFx: "+this.getAgreedFx()+",\n"
				+ " currency:"+this.getCurrency()+", instructionDate: "+this.getInstructionDate()+", requestedSettlementDate: "+this.getRequestedSettlementDate()+",\n"
				+ " actualSettlementDate: "+this.getActualSettlementDate()+", units: "+this.getUnits()+", pricePerUnit: "+this.getPricePerUnit()+",\n"
				+ " amount: $"+this.getAmount()+"}\n";
	}
	
	@Override
	public boolean equals (Object e ) {
		boolean isEqual = false;
		TradeData fe = null;
		if (e instanceof TradeData) {
			fe = (TradeData) e;
			isEqual = true;
		}
		if (isEqual) {
			if (fe.getEntityName().equals(this.getEntityName())
					&& fe.getInstruction().equals(this.getInstruction())
					&& fe.getAgreedFx().equals(this.getAgreedFx())
					&& fe.getCurrency().equals(this.getCurrency())
					&& fe.getInstructionDate().equals(this.getInstructionDate())
					&& fe.getRequestedSettlementDate().equals(this.getRequestedSettlementDate())
					&& fe.getActualSettlementDate().equals(this.getActualSettlementDate())
					&& fe.getUnits() == this.getUnits()
					&& fe.getPricePerUnit().equals(this.getPricePerUnit())
					&& fe.getAmount().equals(this.getAmount())) {
				isEqual = true;
			} else {
				isEqual = false;
			}
		}
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		Random r = new Random();
		int rnum = r.nextInt(99);
		rnum = rnum*this.getEntityName().hashCode() 
				+ rnum*this.getInstruction().hashCode()
				+ rnum*this.getAgreedFx().hashCode()
				+ rnum*this.getCurrency().hashCode()
				+ rnum*this.getInstructionDate().hashCode()
				+ rnum*this.getRequestedSettlementDate().hashCode()
				+ rnum*this.getActualSettlementDate().hashCode()
				+ rnum*this.getUnits()
				+ rnum*this.getPricePerUnit().hashCode()
				+ rnum*this.getAmount().hashCode();
		return rnum;
	}
}
