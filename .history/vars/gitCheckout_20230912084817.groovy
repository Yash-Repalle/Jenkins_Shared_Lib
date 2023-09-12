def call(Map stageParams){
    checkout([
        $class: 'GIT'
    ])
}