def call(Map stageParams){
    checkout([
        $class: 'GITSCM'
        branches: [[name: stageParams.b]]
    ])
}