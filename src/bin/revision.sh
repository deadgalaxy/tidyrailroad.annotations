MAJOR=${1} &&
    MINOR=${2} &&
    git describe --long --tag --dirty --always | sed -e "s#v${MAJOR}.${MINOR}-\([0-9]*\)-.*#${MAJOR}.${MINOR}.\1#"
