package test;

import com.coderscampus.week9.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    // Test-driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass (code itself)
    // Step 3 - Refactor your code
    // -- Repeat

    @Test
    void should_add_one_item_to_list() {
        // Three A's
        // Arrange
        // Act
        // Assert

        // ARRANGE
        CustomList<Integer> customList = new CustomArrayList<>();

        // ACT
        customList.add(10);
        Integer expectedResult = customList.get(0);
        Integer expectedSize = customList.getSize();

        // ASSERT
        // What would we expect to happen?
        // I expect there to be an integer with value 10 stored in the first
        // index in my custom list

        assertEquals(10, expectedResult);
        assertEquals(1, expectedSize);
    }
}