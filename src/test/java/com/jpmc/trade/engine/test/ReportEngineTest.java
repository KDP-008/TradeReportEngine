/**
 * 
 */
package com.jpmc.trade.engine.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.jpmc.trade.engine.business.ReportEngineService;
import com.jpmc.trade.engine.models.TradeData;

/**
 * @author kdp
 *
 */
public class ReportEngineTest {
	File file;
	Optional<List<TradeData>> instructionsReceived;
	Map<String, Map<String,List<TradeData>>> instructionFromEntities;
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() throws IOException {
		ClassLoader classLoader = this.getClass().getClassLoader();
        file = new File(classLoader.getResource("sampleData.csv").getFile());
        instructionsReceived = ReportEngineService.setFetchTradeData(file.getAbsolutePath());
	}
	
	@Test
	public void checkTestDataExists() {
		assertTrue(file.exists());
	}
	
	@Test
	public void testThatOptionalIsNotEmpty() {
	    assertTrue(instructionsReceived.isPresent());
	}
	
	@Test
	public void testGetAllTradeDataForEntities() throws IOException {
		instructionFromEntities = ReportEngineService.getAllTradeDataForEntities(instructionsReceived.get());
		assertNotNull(instructionFromEntities);
	}
}
