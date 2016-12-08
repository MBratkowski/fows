mkdir -p $CIRCLE_ARTIFACTS/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/reports/findbugs
mkdir -p $CIRCLE_ARTIFCATS/reports/checkstyle
cp -r app/build/reports/checkstyle/* $CRICLE_ARTIFACTS/reports/checkstyle/
cp -r app/build/reports/findbugs/* $CIRCLE_ARTIFACTS/reports/findbugs/
cp -r app/build/outputs/lint-results* $CIRCLE_ARTIFACTS/reports/lint/