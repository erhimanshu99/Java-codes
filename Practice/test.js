asyncFunction1(arg1, function(result1) {
    asyncFunction2(result1, function(result2) {
        asyncFunction3(result2, function(result3) {
            // Nested callback continues...
        });
    });
});
