package testing;

import model.ProjectTester;
import model.ProjectTesterImp;
import model.SearchResult;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Fruits2SearchTester {
  public static void main(String[] args) throws Exception {
    ProjectTester tester =
        new ProjectTesterImp(); // Instantiate your own ProjectTester instance here
    tester.initialize();
    tester.crawl("https://people.scs.carleton.ca/~davidmckenney/fruits2/N-0.html");
    runTest(tester);
  }

  public static void runTest(ProjectTester tester) throws Exception {
    PrintWriter failOut = new PrintWriter(new FileWriter("Fruits2-Search-failed.txt"));
    PrintWriter passOut = new PrintWriter(new FileWriter("Fruits2-Search-passed.txt"));
    List<SearchResult> yourResult;
    // Test #291 checking search results for apple banana tomato peach peach with boost=true
    yourResult = tester.search("apple banana tomato peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana tomato peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #291 checking search results for apple banana tomato peach peach with boost=true");
    // Test #292 checking search results for apple banana tomato peach peach with boost=false
    yourResult = tester.search("apple banana tomato peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana tomato peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #292 checking search results for apple banana tomato peach peach with boost=false");
    // Test #293 checking search results for apple peach banana peach coconut with boost=true
    yourResult = tester.search("apple peach banana peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #293 checking search results for apple peach banana peach coconut with boost=true");
    // Test #294 checking search results for apple peach banana peach coconut with boost=false
    yourResult = tester.search("apple peach banana peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #294 checking search results for apple peach banana peach coconut with boost=false");
    // Test #295 checking search results for peach peach banana coconut apple with boost=true
    yourResult = tester.search("peach peach banana coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana coconut apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #295 checking search results for peach peach banana coconut apple with boost=true");
    // Test #296 checking search results for peach peach banana coconut apple with boost=false
    yourResult = tester.search("peach peach banana coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana coconut apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #296 checking search results for peach peach banana coconut apple with boost=false");
    // Test #297 checking search results for coconut peach peach apple banana with boost=true
    yourResult = tester.search("coconut peach peach apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #297 checking search results for coconut peach peach apple banana with boost=true");
    // Test #298 checking search results for coconut peach peach apple banana with boost=false
    yourResult = tester.search("coconut peach peach apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #298 checking search results for coconut peach peach apple banana with boost=false");
    // Test #299 checking search results for peach coconut banana apple peach with boost=true
    yourResult = tester.search("peach coconut banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #299 checking search results for peach coconut banana apple peach with boost=true");
    // Test #300 checking search results for peach coconut banana apple peach with boost=false
    yourResult = tester.search("peach coconut banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #300 checking search results for peach coconut banana apple peach with boost=false");
    // Test #301 checking search results for peach tomato apple banana peach with boost=true
    yourResult = tester.search("peach tomato apple banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #301 checking search results for peach tomato apple banana peach with boost=true");
    // Test #302 checking search results for peach tomato apple banana peach with boost=false
    yourResult = tester.search("peach tomato apple banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #302 checking search results for peach tomato apple banana peach with boost=false");
    // Test #303 checking search results for peach banana coconut apple peach with boost=true
    yourResult = tester.search("peach banana coconut apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #303 checking search results for peach banana coconut apple peach with boost=true");
    // Test #304 checking search results for peach banana coconut apple peach with boost=false
    yourResult = tester.search("peach banana coconut apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #304 checking search results for peach banana coconut apple peach with boost=false");
    // Test #305 checking search results for apple peach peach banana coconut with boost=true
    yourResult = tester.search("apple peach peach banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #305 checking search results for apple peach peach banana coconut with boost=true");
    // Test #306 checking search results for apple peach peach banana coconut with boost=false
    yourResult = tester.search("apple peach peach banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #306 checking search results for apple peach peach banana coconut with boost=false");
    // Test #307 checking search results for apple peach banana coconut peach with boost=true
    yourResult = tester.search("apple peach banana coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #307 checking search results for apple peach banana coconut peach with boost=true");
    // Test #308 checking search results for apple peach banana coconut peach with boost=false
    yourResult = tester.search("apple peach banana coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #308 checking search results for apple peach banana coconut peach with boost=false");
    // Test #309 checking search results for peach peach tomato banana apple with boost=true
    yourResult = tester.search("peach peach tomato banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato banana apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #309 checking search results for peach peach tomato banana apple with boost=true");
    // Test #310 checking search results for peach peach tomato banana apple with boost=false
    yourResult = tester.search("peach peach tomato banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato banana apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #310 checking search results for peach peach tomato banana apple with boost=false");
    // Test #311 checking search results for apple peach peach banana coconut with boost=true
    yourResult = tester.search("apple peach peach banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #311 checking search results for apple peach peach banana coconut with boost=true");
    // Test #312 checking search results for apple peach peach banana coconut with boost=false
    yourResult = tester.search("apple peach peach banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #312 checking search results for apple peach peach banana coconut with boost=false");
    // Test #313 checking search results for banana apple coconut peach peach with boost=true
    yourResult = tester.search("banana apple coconut peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #313 checking search results for banana apple coconut peach peach with boost=true");
    // Test #314 checking search results for banana apple coconut peach peach with boost=false
    yourResult = tester.search("banana apple coconut peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #314 checking search results for banana apple coconut peach peach with boost=false");
    // Test #315 checking search results for peach peach banana tomato apple with boost=true
    yourResult = tester.search("peach peach banana tomato apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana tomato apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #315 checking search results for peach peach banana tomato apple with boost=true");
    // Test #316 checking search results for peach peach banana tomato apple with boost=false
    yourResult = tester.search("peach peach banana tomato apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana tomato apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #316 checking search results for peach peach banana tomato apple with boost=false");
    // Test #317 checking search results for apple peach peach banana tomato with boost=true
    yourResult = tester.search("apple peach peach banana tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #317 checking search results for apple peach peach banana tomato with boost=true");
    // Test #318 checking search results for apple peach peach banana tomato with boost=false
    yourResult = tester.search("apple peach peach banana tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #318 checking search results for apple peach peach banana tomato with boost=false");
    // Test #319 checking search results for tomato peach apple banana peach with boost=true
    yourResult = tester.search("tomato peach apple banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach apple banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #319 checking search results for tomato peach apple banana peach with boost=true");
    // Test #320 checking search results for tomato peach apple banana peach with boost=false
    yourResult = tester.search("tomato peach apple banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach apple banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #320 checking search results for tomato peach apple banana peach with boost=false");
    // Test #321 checking search results for banana peach apple peach coconut with boost=true
    yourResult = tester.search("banana peach apple peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #321 checking search results for banana peach apple peach coconut with boost=true");
    // Test #322 checking search results for banana peach apple peach coconut with boost=false
    yourResult = tester.search("banana peach apple peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #322 checking search results for banana peach apple peach coconut with boost=false");
    // Test #323 checking search results for apple peach peach banana coconut with boost=true
    yourResult = tester.search("apple peach peach banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #323 checking search results for apple peach peach banana coconut with boost=true");
    // Test #324 checking search results for apple peach peach banana coconut with boost=false
    yourResult = tester.search("apple peach peach banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #324 checking search results for apple peach peach banana coconut with boost=false");
    // Test #325 checking search results for peach tomato banana apple peach with boost=true
    yourResult = tester.search("peach tomato banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #325 checking search results for peach tomato banana apple peach with boost=true");
    // Test #326 checking search results for peach tomato banana apple peach with boost=false
    yourResult = tester.search("peach tomato banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #326 checking search results for peach tomato banana apple peach with boost=false");
    // Test #327 checking search results for apple peach banana tomato peach with boost=true
    yourResult = tester.search("apple peach banana tomato peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana tomato peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #327 checking search results for apple peach banana tomato peach with boost=true");
    // Test #328 checking search results for apple peach banana tomato peach with boost=false
    yourResult = tester.search("apple peach banana tomato peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana tomato peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #328 checking search results for apple peach banana tomato peach with boost=false");
    // Test #329 checking search results for tomato apple peach banana peach with boost=true
    yourResult = tester.search("tomato apple peach banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #329 checking search results for tomato apple peach banana peach with boost=true");
    // Test #330 checking search results for tomato apple peach banana peach with boost=false
    yourResult = tester.search("tomato apple peach banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #330 checking search results for tomato apple peach banana peach with boost=false");
    // Test #331 checking search results for peach banana peach apple tomato with boost=true
    yourResult = tester.search("peach banana peach apple tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach apple tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #331 checking search results for peach banana peach apple tomato with boost=true");
    // Test #332 checking search results for peach banana peach apple tomato with boost=false
    yourResult = tester.search("peach banana peach apple tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach apple tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #332 checking search results for peach banana peach apple tomato with boost=false");
    // Test #333 checking search results for apple coconut apple apple peach with boost=true
    yourResult = tester.search("apple coconut apple apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #333 checking search results for apple coconut apple apple peach with boost=true");
    // Test #334 checking search results for apple coconut apple apple peach with boost=false
    yourResult = tester.search("apple coconut apple apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #334 checking search results for apple coconut apple apple peach with boost=false");
    // Test #335 checking search results for peach coconut banana peach apple with boost=true
    yourResult = tester.search("peach coconut banana peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #335 checking search results for peach coconut banana peach apple with boost=true");
    // Test #336 checking search results for peach coconut banana peach apple with boost=false
    yourResult = tester.search("peach coconut banana peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #336 checking search results for peach coconut banana peach apple with boost=false");
    // Test #337 checking search results for coconut peach peach apple banana with boost=true
    yourResult = tester.search("coconut peach peach apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #337 checking search results for coconut peach peach apple banana with boost=true");
    // Test #338 checking search results for coconut peach peach apple banana with boost=false
    yourResult = tester.search("coconut peach peach apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #338 checking search results for coconut peach peach apple banana with boost=false");
    // Test #339 checking search results for peach apple peach banana coconut with boost=true
    yourResult = tester.search("peach apple peach banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #339 checking search results for peach apple peach banana coconut with boost=true");
    // Test #340 checking search results for peach apple peach banana coconut with boost=false
    yourResult = tester.search("peach apple peach banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #340 checking search results for peach apple peach banana coconut with boost=false");
    // Test #341 checking search results for banana apple coconut peach peach with boost=true
    yourResult = tester.search("banana apple coconut peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #341 checking search results for banana apple coconut peach peach with boost=true");
    // Test #342 checking search results for banana apple coconut peach peach with boost=false
    yourResult = tester.search("banana apple coconut peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #342 checking search results for banana apple coconut peach peach with boost=false");
    // Test #343 checking search results for apple coconut apple peach apple with boost=true
    yourResult = tester.search("apple coconut apple peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #343 checking search results for apple coconut apple peach apple with boost=true");
    // Test #344 checking search results for apple coconut apple peach apple with boost=false
    yourResult = tester.search("apple coconut apple peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #344 checking search results for apple coconut apple peach apple with boost=false");
    // Test #345 checking search results for peach banana tomato apple peach with boost=true
    yourResult = tester.search("peach banana tomato apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana tomato apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #345 checking search results for peach banana tomato apple peach with boost=true");
    // Test #346 checking search results for peach banana tomato apple peach with boost=false
    yourResult = tester.search("peach banana tomato apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana tomato apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #346 checking search results for peach banana tomato apple peach with boost=false");
    // Test #347 checking search results for peach apple apple coconut apple with boost=true
    yourResult = tester.search("peach apple apple coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple coconut apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #347 checking search results for peach apple apple coconut apple with boost=true");
    // Test #348 checking search results for peach apple apple coconut apple with boost=false
    yourResult = tester.search("peach apple apple coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple coconut apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #348 checking search results for peach apple apple coconut apple with boost=false");
    // Test #349 checking search results for banana peach peach apple coconut with boost=true
    yourResult = tester.search("banana peach peach apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #349 checking search results for banana peach peach apple coconut with boost=true");
    // Test #350 checking search results for banana peach peach apple coconut with boost=false
    yourResult = tester.search("banana peach peach apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #350 checking search results for banana peach peach apple coconut with boost=false");
    // Test #351 checking search results for peach banana apple coconut peach with boost=true
    yourResult = tester.search("peach banana apple coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #351 checking search results for peach banana apple coconut peach with boost=true");
    // Test #352 checking search results for peach banana apple coconut peach with boost=false
    yourResult = tester.search("peach banana apple coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #352 checking search results for peach banana apple coconut peach with boost=false");
    // Test #353 checking search results for apple banana peach coconut peach with boost=true
    yourResult = tester.search("apple banana peach coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana peach coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #353 checking search results for apple banana peach coconut peach with boost=true");
    // Test #354 checking search results for apple banana peach coconut peach with boost=false
    yourResult = tester.search("apple banana peach coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana peach coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #354 checking search results for apple banana peach coconut peach with boost=false");
    // Test #355 checking search results for peach tomato apple banana peach with boost=true
    yourResult = tester.search("peach tomato apple banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #355 checking search results for peach tomato apple banana peach with boost=true");
    // Test #356 checking search results for peach tomato apple banana peach with boost=false
    yourResult = tester.search("peach tomato apple banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #356 checking search results for peach tomato apple banana peach with boost=false");
    // Test #357 checking search results for apple peach banana coconut peach with boost=true
    yourResult = tester.search("apple peach banana coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #357 checking search results for apple peach banana coconut peach with boost=true");
    // Test #358 checking search results for apple peach banana coconut peach with boost=false
    yourResult = tester.search("apple peach banana coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #358 checking search results for apple peach banana coconut peach with boost=false");
    // Test #359 checking search results for apple peach banana peach tomato with boost=true
    yourResult = tester.search("apple peach banana peach tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #359 checking search results for apple peach banana peach tomato with boost=true");
    // Test #360 checking search results for apple peach banana peach tomato with boost=false
    yourResult = tester.search("apple peach banana peach tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #360 checking search results for apple peach banana peach tomato with boost=false");
    // Test #361 checking search results for peach apple peach banana tomato with boost=true
    yourResult = tester.search("peach apple peach banana tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #361 checking search results for peach apple peach banana tomato with boost=true");
    // Test #362 checking search results for peach apple peach banana tomato with boost=false
    yourResult = tester.search("peach apple peach banana tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #362 checking search results for peach apple peach banana tomato with boost=false");
    // Test #363 checking search results for coconut peach banana apple peach with boost=true
    yourResult = tester.search("coconut peach banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #363 checking search results for coconut peach banana apple peach with boost=true");
    // Test #364 checking search results for coconut peach banana apple peach with boost=false
    yourResult = tester.search("coconut peach banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #364 checking search results for coconut peach banana apple peach with boost=false");
    // Test #365 checking search results for banana coconut apple peach peach with boost=true
    yourResult = tester.search("banana coconut apple peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut apple peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #365 checking search results for banana coconut apple peach peach with boost=true");
    // Test #366 checking search results for banana coconut apple peach peach with boost=false
    yourResult = tester.search("banana coconut apple peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut apple peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #366 checking search results for banana coconut apple peach peach with boost=false");
    // Test #367 checking search results for tomato peach banana peach apple with boost=true
    yourResult = tester.search("tomato peach banana peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach banana peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #367 checking search results for tomato peach banana peach apple with boost=true");
    // Test #368 checking search results for tomato peach banana peach apple with boost=false
    yourResult = tester.search("tomato peach banana peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach banana peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #368 checking search results for tomato peach banana peach apple with boost=false");
    // Test #369 checking search results for banana apple peach peach coconut with boost=true
    yourResult = tester.search("banana apple peach peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple peach peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #369 checking search results for banana apple peach peach coconut with boost=true");
    // Test #370 checking search results for banana apple peach peach coconut with boost=false
    yourResult = tester.search("banana apple peach peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple peach peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #370 checking search results for banana apple peach peach coconut with boost=false");
    // Test #371 checking search results for banana apple coconut peach peach with boost=true
    yourResult = tester.search("banana apple coconut peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #371 checking search results for banana apple coconut peach peach with boost=true");
    // Test #372 checking search results for banana apple coconut peach peach with boost=false
    yourResult = tester.search("banana apple coconut peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apple coconut peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #372 checking search results for banana apple coconut peach peach with boost=false");
    // Test #373 checking search results for peach banana apple peach tomato with boost=true
    yourResult = tester.search("peach banana apple peach tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple peach tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #373 checking search results for peach banana apple peach tomato with boost=true");
    // Test #374 checking search results for peach banana apple peach tomato with boost=false
    yourResult = tester.search("peach banana apple peach tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple peach tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #374 checking search results for peach banana apple peach tomato with boost=false");
    // Test #375 checking search results for banana coconut apple peach peach with boost=true
    yourResult = tester.search("banana coconut apple peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut apple peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #375 checking search results for banana coconut apple peach peach with boost=true");
    // Test #376 checking search results for banana coconut apple peach peach with boost=false
    yourResult = tester.search("banana coconut apple peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut apple peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #376 checking search results for banana coconut apple peach peach with boost=false");
    // Test #377 checking search results for apple peach peach tomato banana with boost=true
    yourResult = tester.search("apple peach peach tomato banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach tomato banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #377 checking search results for apple peach peach tomato banana with boost=true");
    // Test #378 checking search results for apple peach peach tomato banana with boost=false
    yourResult = tester.search("apple peach peach tomato banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach peach tomato banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #378 checking search results for apple peach peach tomato banana with boost=false");
    // Test #379 checking search results for peach peach banana coconut apple with boost=true
    yourResult = tester.search("peach peach banana coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana coconut apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #379 checking search results for peach peach banana coconut apple with boost=true");
    // Test #380 checking search results for peach peach banana coconut apple with boost=false
    yourResult = tester.search("peach peach banana coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana coconut apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #380 checking search results for peach peach banana coconut apple with boost=false");
    // Test #381 checking search results for peach apple apple apple coconut with boost=true
    yourResult = tester.search("peach apple apple apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple apple coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #381 checking search results for peach apple apple apple coconut with boost=true");
    // Test #382 checking search results for peach apple apple apple coconut with boost=false
    yourResult = tester.search("peach apple apple apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple apple coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #382 checking search results for peach apple apple apple coconut with boost=false");
    // Test #383 checking search results for peach banana apple peach coconut with boost=true
    yourResult = tester.search("peach banana apple peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #383 checking search results for peach banana apple peach coconut with boost=true");
    // Test #384 checking search results for peach banana apple peach coconut with boost=false
    yourResult = tester.search("peach banana apple peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #384 checking search results for peach banana apple peach coconut with boost=false");
    // Test #385 checking search results for apple coconut peach apple apple with boost=true
    yourResult = tester.search("apple coconut peach apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #385 checking search results for apple coconut peach apple apple with boost=true");
    // Test #386 checking search results for apple coconut peach apple apple with boost=false
    yourResult = tester.search("apple coconut peach apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #386 checking search results for apple coconut peach apple apple with boost=false");
    // Test #387 checking search results for peach apple apple apple coconut with boost=true
    yourResult = tester.search("peach apple apple apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple apple coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #387 checking search results for peach apple apple apple coconut with boost=true");
    // Test #388 checking search results for peach apple apple apple coconut with boost=false
    yourResult = tester.search("peach apple apple apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple apple coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #388 checking search results for peach apple apple apple coconut with boost=false");
    // Test #389 checking search results for peach tomato apple peach banana with boost=true
    yourResult = tester.search("peach tomato apple peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #389 checking search results for peach tomato apple peach banana with boost=true");
    // Test #390 checking search results for peach tomato apple peach banana with boost=false
    yourResult = tester.search("peach tomato apple peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #390 checking search results for peach tomato apple peach banana with boost=false");
    // Test #391 checking search results for apple coconut peach apple apple with boost=true
    yourResult = tester.search("apple coconut peach apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #391 checking search results for apple coconut peach apple apple with boost=true");
    // Test #392 checking search results for apple coconut peach apple apple with boost=false
    yourResult = tester.search("apple coconut peach apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #392 checking search results for apple coconut peach apple apple with boost=false");
    // Test #393 checking search results for coconut apple peach peach banana with boost=true
    yourResult = tester.search("coconut apple peach peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple peach peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #393 checking search results for coconut apple peach peach banana with boost=true");
    // Test #394 checking search results for coconut apple peach peach banana with boost=false
    yourResult = tester.search("coconut apple peach peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple peach peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #394 checking search results for coconut apple peach peach banana with boost=false");
    // Test #395 checking search results for tomato peach peach apple banana with boost=true
    yourResult = tester.search("tomato peach peach apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach peach apple banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #395 checking search results for tomato peach peach apple banana with boost=true");
    // Test #396 checking search results for tomato peach peach apple banana with boost=false
    yourResult = tester.search("tomato peach peach apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach peach apple banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #396 checking search results for tomato peach peach apple banana with boost=false");
    // Test #397 checking search results for peach peach banana apple tomato with boost=true
    yourResult = tester.search("peach peach banana apple tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana apple tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #397 checking search results for peach peach banana apple tomato with boost=true");
    // Test #398 checking search results for peach peach banana apple tomato with boost=false
    yourResult = tester.search("peach peach banana apple tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana apple tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #398 checking search results for peach peach banana apple tomato with boost=false");
    // Test #399 checking search results for peach peach apple banana coconut with boost=true
    yourResult = tester.search("peach peach apple banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #399 checking search results for peach peach apple banana coconut with boost=true");
    // Test #400 checking search results for peach peach apple banana coconut with boost=false
    yourResult = tester.search("peach peach apple banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #400 checking search results for peach peach apple banana coconut with boost=false");
    // Test #401 checking search results for tomato apple peach peach banana with boost=true
    yourResult = tester.search("tomato apple peach peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #401 checking search results for tomato apple peach peach banana with boost=true");
    // Test #402 checking search results for tomato apple peach peach banana with boost=false
    yourResult = tester.search("tomato apple peach peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #402 checking search results for tomato apple peach peach banana with boost=false");
    // Test #403 checking search results for peach tomato banana apple peach with boost=true
    yourResult = tester.search("peach tomato banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #403 checking search results for peach tomato banana apple peach with boost=true");
    // Test #404 checking search results for peach tomato banana apple peach with boost=false
    yourResult = tester.search("peach tomato banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #404 checking search results for peach tomato banana apple peach with boost=false");
    // Test #405 checking search results for peach coconut banana apple peach with boost=true
    yourResult = tester.search("peach coconut banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #405 checking search results for peach coconut banana apple peach with boost=true");
    // Test #406 checking search results for peach coconut banana apple peach with boost=false
    yourResult = tester.search("peach coconut banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #406 checking search results for peach coconut banana apple peach with boost=false");
    // Test #407 checking search results for banana tomato peach peach apple with boost=true
    yourResult = tester.search("banana tomato peach peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana tomato peach peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #407 checking search results for banana tomato peach peach apple with boost=true");
    // Test #408 checking search results for banana tomato peach peach apple with boost=false
    yourResult = tester.search("banana tomato peach peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana tomato peach peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #408 checking search results for banana tomato peach peach apple with boost=false");
    // Test #409 checking search results for banana peach apple peach coconut with boost=true
    yourResult = tester.search("banana peach apple peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #409 checking search results for banana peach apple peach coconut with boost=true");
    // Test #410 checking search results for banana peach apple peach coconut with boost=false
    yourResult = tester.search("banana peach apple peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #410 checking search results for banana peach apple peach coconut with boost=false");
    // Test #411 checking search results for peach banana coconut peach apple with boost=true
    yourResult = tester.search("peach banana coconut peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #411 checking search results for peach banana coconut peach apple with boost=true");
    // Test #412 checking search results for peach banana coconut peach apple with boost=false
    yourResult = tester.search("peach banana coconut peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #412 checking search results for peach banana coconut peach apple with boost=false");
    // Test #413 checking search results for peach tomato peach banana apple with boost=true
    yourResult = tester.search("peach tomato peach banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato peach banana apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #413 checking search results for peach tomato peach banana apple with boost=true");
    // Test #414 checking search results for peach tomato peach banana apple with boost=false
    yourResult = tester.search("peach tomato peach banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato peach banana apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #414 checking search results for peach tomato peach banana apple with boost=false");
    // Test #415 checking search results for banana peach peach apple coconut with boost=true
    yourResult = tester.search("banana peach peach apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #415 checking search results for banana peach peach apple coconut with boost=true");
    // Test #416 checking search results for banana peach peach apple coconut with boost=false
    yourResult = tester.search("banana peach peach apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #416 checking search results for banana peach peach apple coconut with boost=false");
    // Test #417 checking search results for banana peach peach coconut apple with boost=true
    yourResult = tester.search("banana peach peach coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach coconut apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #417 checking search results for banana peach peach coconut apple with boost=true");
    // Test #418 checking search results for banana peach peach coconut apple with boost=false
    yourResult = tester.search("banana peach peach coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach coconut apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #418 checking search results for banana peach peach coconut apple with boost=false");
    // Test #419 checking search results for peach coconut banana apple peach with boost=true
    yourResult = tester.search("peach coconut banana apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #419 checking search results for peach coconut banana apple peach with boost=true");
    // Test #420 checking search results for peach coconut banana apple peach with boost=false
    yourResult = tester.search("peach coconut banana apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut banana apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #420 checking search results for peach coconut banana apple peach with boost=false");
    // Test #421 checking search results for apple peach banana peach coconut with boost=true
    yourResult = tester.search("apple peach banana peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #421 checking search results for apple peach banana peach coconut with boost=true");
    // Test #422 checking search results for apple peach banana peach coconut with boost=false
    yourResult = tester.search("apple peach banana peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach banana peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #422 checking search results for apple peach banana peach coconut with boost=false");
    // Test #423 checking search results for banana peach apple peach coconut with boost=true
    yourResult = tester.search("banana peach apple peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #423 checking search results for banana peach apple peach coconut with boost=true");
    // Test #424 checking search results for banana peach apple peach coconut with boost=false
    yourResult = tester.search("banana peach apple peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach apple peach coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #424 checking search results for banana peach apple peach coconut with boost=false");
    // Test #425 checking search results for tomato peach apple banana peach with boost=true
    yourResult = tester.search("tomato peach apple banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach apple banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #425 checking search results for tomato peach apple banana peach with boost=true");
    // Test #426 checking search results for tomato peach apple banana peach with boost=false
    yourResult = tester.search("tomato peach apple banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato peach apple banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #426 checking search results for tomato peach apple banana peach with boost=false");
    // Test #427 checking search results for apple banana peach coconut peach with boost=true
    yourResult = tester.search("apple banana peach coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana peach coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #427 checking search results for apple banana peach coconut peach with boost=true");
    // Test #428 checking search results for apple banana peach coconut peach with boost=false
    yourResult = tester.search("apple banana peach coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana peach coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #428 checking search results for apple banana peach coconut peach with boost=false");
    // Test #429 checking search results for peach apple banana coconut peach with boost=true
    yourResult = tester.search("peach apple banana coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple banana coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #429 checking search results for peach apple banana coconut peach with boost=true");
    // Test #430 checking search results for peach apple banana coconut peach with boost=false
    yourResult = tester.search("peach apple banana coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple banana coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #430 checking search results for peach apple banana coconut peach with boost=false");
    // Test #431 checking search results for peach banana apple coconut peach with boost=true
    yourResult = tester.search("peach banana apple coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple coconut peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #431 checking search results for peach banana apple coconut peach with boost=true");
    // Test #432 checking search results for peach banana apple coconut peach with boost=false
    yourResult = tester.search("peach banana apple coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple coconut peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #432 checking search results for peach banana apple coconut peach with boost=false");
    // Test #433 checking search results for peach apple coconut banana peach with boost=true
    yourResult = tester.search("peach apple coconut banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple coconut banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #433 checking search results for peach apple coconut banana peach with boost=true");
    // Test #434 checking search results for peach apple coconut banana peach with boost=false
    yourResult = tester.search("peach apple coconut banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple coconut banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #434 checking search results for peach apple coconut banana peach with boost=false");
    // Test #435 checking search results for coconut peach apple banana peach with boost=true
    yourResult = tester.search("coconut peach apple banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach apple banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #435 checking search results for coconut peach apple banana peach with boost=true");
    // Test #436 checking search results for coconut peach apple banana peach with boost=false
    yourResult = tester.search("coconut peach apple banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach apple banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #436 checking search results for coconut peach apple banana peach with boost=false");
    // Test #437 checking search results for banana peach peach apple coconut with boost=true
    yourResult = tester.search("banana peach peach apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #437 checking search results for banana peach peach apple coconut with boost=true");
    // Test #438 checking search results for banana peach peach apple coconut with boost=false
    yourResult = tester.search("banana peach peach apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach peach apple coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #438 checking search results for banana peach peach apple coconut with boost=false");
    // Test #439 checking search results for coconut peach banana peach apple with boost=true
    yourResult = tester.search("coconut peach banana peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #439 checking search results for coconut peach banana peach apple with boost=true");
    // Test #440 checking search results for coconut peach banana peach apple with boost=false
    yourResult = tester.search("coconut peach banana peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #440 checking search results for coconut peach banana peach apple with boost=false");
    // Test #441 checking search results for apple banana tomato peach peach with boost=true
    yourResult = tester.search("apple banana tomato peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana tomato peach peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #441 checking search results for apple banana tomato peach peach with boost=true");
    // Test #442 checking search results for apple banana tomato peach peach with boost=false
    yourResult = tester.search("apple banana tomato peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana tomato peach peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #442 checking search results for apple banana tomato peach peach with boost=false");
    // Test #443 checking search results for peach banana peach apple tomato with boost=true
    yourResult = tester.search("peach banana peach apple tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach apple tomato",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #443 checking search results for peach banana peach apple tomato with boost=true");
    // Test #444 checking search results for peach banana peach apple tomato with boost=false
    yourResult = tester.search("peach banana peach apple tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach apple tomato",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #444 checking search results for peach banana peach apple tomato with boost=false");
    // Test #445 checking search results for coconut apple apple peach apple with boost=true
    yourResult = tester.search("coconut apple apple peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple apple peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #445 checking search results for coconut apple apple peach apple with boost=true");
    // Test #446 checking search results for coconut apple apple peach apple with boost=false
    yourResult = tester.search("coconut apple apple peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple apple peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #446 checking search results for coconut apple apple peach apple with boost=false");
    // Test #447 checking search results for peach peach coconut banana apple with boost=true
    yourResult = tester.search("peach peach coconut banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach coconut banana apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #447 checking search results for peach peach coconut banana apple with boost=true");
    // Test #448 checking search results for peach peach coconut banana apple with boost=false
    yourResult = tester.search("peach peach coconut banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach coconut banana apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #448 checking search results for peach peach coconut banana apple with boost=false");
    // Test #449 checking search results for peach peach apple banana coconut with boost=true
    yourResult = tester.search("peach peach apple banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple banana coconut",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #449 checking search results for peach peach apple banana coconut with boost=true");
    // Test #450 checking search results for peach peach apple banana coconut with boost=false
    yourResult = tester.search("peach peach apple banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple banana coconut",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #450 checking search results for peach peach apple banana coconut with boost=false");
    // Test #451 checking search results for coconut peach peach apple banana with boost=true
    yourResult = tester.search("coconut peach peach apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #451 checking search results for coconut peach peach apple banana with boost=true");
    // Test #452 checking search results for coconut peach peach apple banana with boost=false
    yourResult = tester.search("coconut peach peach apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach apple banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #452 checking search results for coconut peach peach apple banana with boost=false");
    // Test #453 checking search results for banana peach tomato apple peach with boost=true
    yourResult = tester.search("banana peach tomato apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach tomato apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #453 checking search results for banana peach tomato apple peach with boost=true");
    // Test #454 checking search results for banana peach tomato apple peach with boost=false
    yourResult = tester.search("banana peach tomato apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana peach tomato apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #454 checking search results for banana peach tomato apple peach with boost=false");
    // Test #455 checking search results for peach banana peach tomato apple with boost=true
    yourResult = tester.search("peach banana peach tomato apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach tomato apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #455 checking search results for peach banana peach tomato apple with boost=true");
    // Test #456 checking search results for peach banana peach tomato apple with boost=false
    yourResult = tester.search("peach banana peach tomato apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana peach tomato apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #456 checking search results for peach banana peach tomato apple with boost=false");
    // Test #457 checking search results for apple peach tomato peach banana with boost=true
    yourResult = tester.search("apple peach tomato peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach tomato peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #457 checking search results for apple peach tomato peach banana with boost=true");
    // Test #458 checking search results for apple peach tomato peach banana with boost=false
    yourResult = tester.search("apple peach tomato peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach tomato peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #458 checking search results for apple peach tomato peach banana with boost=false");
    // Test #459 checking search results for peach peach tomato banana apple with boost=true
    yourResult = tester.search("peach peach tomato banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato banana apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #459 checking search results for peach peach tomato banana apple with boost=true");
    // Test #460 checking search results for peach peach tomato banana apple with boost=false
    yourResult = tester.search("peach peach tomato banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato banana apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #460 checking search results for peach peach tomato banana apple with boost=false");
    // Test #461 checking search results for peach peach apple tomato banana with boost=true
    yourResult = tester.search("peach peach apple tomato banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple tomato banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #461 checking search results for peach peach apple tomato banana with boost=true");
    // Test #462 checking search results for peach peach apple tomato banana with boost=false
    yourResult = tester.search("peach peach apple tomato banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple tomato banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #462 checking search results for peach peach apple tomato banana with boost=false");
    // Test #463 checking search results for coconut apple peach apple apple with boost=true
    yourResult = tester.search("coconut apple peach apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple peach apple apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #463 checking search results for coconut apple peach apple apple with boost=true");
    // Test #464 checking search results for coconut apple peach apple apple with boost=false
    yourResult = tester.search("coconut apple peach apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple peach apple apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #464 checking search results for coconut apple peach apple apple with boost=false");
    // Test #465 checking search results for peach peach tomato apple banana with boost=true
    yourResult = tester.search("peach peach tomato apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato apple banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #465 checking search results for peach peach tomato apple banana with boost=true");
    // Test #466 checking search results for peach peach tomato apple banana with boost=false
    yourResult = tester.search("peach peach tomato apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach tomato apple banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #466 checking search results for peach peach tomato apple banana with boost=false");
    // Test #467 checking search results for peach apple coconut banana peach with boost=true
    yourResult = tester.search("peach apple coconut banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple coconut banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #467 checking search results for peach apple coconut banana peach with boost=true");
    // Test #468 checking search results for peach apple coconut banana peach with boost=false
    yourResult = tester.search("peach apple coconut banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple coconut banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #468 checking search results for peach apple coconut banana peach with boost=false");
    // Test #469 checking search results for coconut apple apple apple peach with boost=true
    yourResult = tester.search("coconut apple apple apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple apple apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #469 checking search results for coconut apple apple apple peach with boost=true");
    // Test #470 checking search results for coconut apple apple apple peach with boost=false
    yourResult = tester.search("coconut apple apple apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple apple apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #470 checking search results for coconut apple apple apple peach with boost=false");
    // Test #471 checking search results for peach tomato apple peach banana with boost=true
    yourResult = tester.search("peach tomato apple peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #471 checking search results for peach tomato apple peach banana with boost=true");
    // Test #472 checking search results for peach tomato apple peach banana with boost=false
    yourResult = tester.search("peach tomato apple peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach tomato apple peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #472 checking search results for peach tomato apple peach banana with boost=false");
    // Test #473 checking search results for peach peach banana tomato apple with boost=true
    yourResult = tester.search("peach peach banana tomato apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana tomato apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #473 checking search results for peach peach banana tomato apple with boost=true");
    // Test #474 checking search results for peach peach banana tomato apple with boost=false
    yourResult = tester.search("peach peach banana tomato apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach banana tomato apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #474 checking search results for peach peach banana tomato apple with boost=false");
    // Test #475 checking search results for apple tomato peach banana peach with boost=true
    yourResult = tester.search("apple tomato peach banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato peach banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #475 checking search results for apple tomato peach banana peach with boost=true");
    // Test #476 checking search results for apple tomato peach banana peach with boost=false
    yourResult = tester.search("apple tomato peach banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato peach banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #476 checking search results for apple tomato peach banana peach with boost=false");
    // Test #477 checking search results for peach banana tomato apple peach with boost=true
    yourResult = tester.search("peach banana tomato apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana tomato apple peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #477 checking search results for peach banana tomato apple peach with boost=true");
    // Test #478 checking search results for peach banana tomato apple peach with boost=false
    yourResult = tester.search("peach banana tomato apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana tomato apple peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #478 checking search results for peach banana tomato apple peach with boost=false");
    // Test #479 checking search results for peach banana coconut peach apple with boost=true
    yourResult = tester.search("peach banana coconut peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #479 checking search results for peach banana coconut peach apple with boost=true");
    // Test #480 checking search results for peach banana coconut peach apple with boost=false
    yourResult = tester.search("peach banana coconut peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana coconut peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #480 checking search results for peach banana coconut peach apple with boost=false");
    // Test #481 checking search results for apple coconut peach banana peach with boost=true
    yourResult = tester.search("apple coconut peach banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach banana peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #481 checking search results for apple coconut peach banana peach with boost=true");
    // Test #482 checking search results for apple coconut peach banana peach with boost=false
    yourResult = tester.search("apple coconut peach banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach banana peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #482 checking search results for apple coconut peach banana peach with boost=false");
    // Test #483 checking search results for peach apple banana tomato peach with boost=true
    yourResult = tester.search("peach apple banana tomato peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple banana tomato peach",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #483 checking search results for peach apple banana tomato peach with boost=true");
    // Test #484 checking search results for peach apple banana tomato peach with boost=false
    yourResult = tester.search("peach apple banana tomato peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple banana tomato peach",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #484 checking search results for peach apple banana tomato peach with boost=false");
    // Test #485 checking search results for apple apple coconut peach apple with boost=true
    yourResult = tester.search("apple apple coconut peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple coconut peach apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #485 checking search results for apple apple coconut peach apple with boost=true");
    // Test #486 checking search results for apple apple coconut peach apple with boost=false
    yourResult = tester.search("apple apple coconut peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple coconut peach apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #486 checking search results for apple apple coconut peach apple with boost=false");
    // Test #487 checking search results for peach coconut peach banana apple with boost=true
    yourResult = tester.search("peach coconut peach banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach banana apple",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #487 checking search results for peach coconut peach banana apple with boost=true");
    // Test #488 checking search results for peach coconut peach banana apple with boost=false
    yourResult = tester.search("peach coconut peach banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach banana apple",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #488 checking search results for peach coconut peach banana apple with boost=false");
    // Test #489 checking search results for tomato apple peach peach banana with boost=true
    yourResult = tester.search("tomato apple peach peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach peach banana",
        true,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #489 checking search results for tomato apple peach peach banana with boost=true");
    // Test #490 checking search results for tomato apple peach peach banana with boost=false
    yourResult = tester.search("tomato apple peach peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach peach banana",
        false,
        passOut,
        failOut,
        "Fruits2SearchTester",
        "Test #490 checking search results for tomato apple peach peach banana with boost=false");
    failOut.close();
    passOut.close();
  }
}
