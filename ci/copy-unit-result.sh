mkdir -p $CIRCLE_ARTIFACTS/app/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/app/reports/findbugs
mkdir -p $CIRCLE_ARTIFACTS/app/reports/checkstyle

mkdir -p $CIRCLE_ARTIFACTS/data/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/data/reports/findbugs
mkdir -p $CIRCLE_ARTIFACTS/data/reports/checkstyle

mkdir -p $CIRCLE_ARTIFACTS/domain/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/domain/reports/findbugs
mkdir -p $CIRCLE_ARTIFACTS/domain/reports/checkstyle

mkdir -p $CIRCLE_ARTIFACTS/presentation/reports/lint
mkdir -p $CIRCLE_ARTIFACTS/presentation/reports/findbugs
mkdir -p $CIRCLE_ARTIFACTS/presentation/reports/checkstyle

cp -r data/build/reports/checkstyle/* $CIRCLE_ARTIFACTS/data/reports/checkstyle/
cp -r data/build/reports/findbugs/* $CIRCLE_ARTIFACTS/data/reports/findbugs/
cp -r data/build/outputs/lint-results* $CIRCLE_ARTIFACTS/data/reports/lint/

cp -r domain/build/reports/checkstyle/* $CIRCLE_ARTIFACTS/domain/reports/checkstyle/
cp -r domain/build/reports/findbugs/* $CIRCLE_ARTIFACTS/domain/reports/findbugs/
cp -r domain/build/outputs/lint-results* $CIRCLE_ARTIFACTS/domain/reports/lint/

cp -r presentation/build/reports/checkstyle/* $CIRCLE_ARTIFACTS/presentation/reports/checkstyle/
cp -r presentation/build/reports/findbugs/* $CIRCLE_ARTIFACTS/presentation/reports/findbugs/
cp -r presentation/build/outputs/lint-results* $CIRCLE_ARTIFACTS/presentation/reports/lint/

cp -r app/build/reports/checkstyle/* $CIRCLE_ARTIFACTS/app/reports/checkstyle/
cp -r app/build/reports/findbugs/* $CIRCLE_ARTIFACTS/app/reports/findbugs/
cp -r app/build/outputs/lint-results* $CIRCLE_ARTIFACTS/app/reports/lint/