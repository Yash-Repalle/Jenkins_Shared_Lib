def call(Map stageParams){
    checkout([
        $class: 'GITSCM'
        branches: [[name: st]]
    ])
}