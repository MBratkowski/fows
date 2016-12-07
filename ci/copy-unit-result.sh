mkdir -p $CIRCLE_ARTIFACTS/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/reports/unit_tests
mkdir -p $CIRCLE_ARTIFACTS/reports/findbugs
cp -r app/build/test-results/howdyDebug $CIRCLE_TEST_REPORTS/debug
cp -r app/build/test-results/howdyRelease $CIRCLE_TEST_REPORTS/release
cp -r app/build/reports/tests/* $CIRCLE_ARTIFACTS/reports/unit_tests/
cp -r app/build/reports/tests/* $CIRCLE_ARTIFACTS/reports/unit_tests/
cp -r app/build/reports/findbugs/* $CIRCLE_ARTIFACTS/reports/findbugs/
cp -r app/build/outputs/lint-results* $CIRCLE_ARTIFACTS/reports/lint/