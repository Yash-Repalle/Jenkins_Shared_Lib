def call(Map stageParams){
    checkout([
        $class: 'GITSC'
    ])
}